package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WeeSpellstopper_2234 : Card() {
    override val id = 2234
    override val name = "小个子扰咒师"
    override val description = "相邻的随从 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "有些大块头正需要小个子的保护。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba99b55b31dc54bc331eea9192be132b73a78f274debeaf40e76305d5f09b473.png"
}
