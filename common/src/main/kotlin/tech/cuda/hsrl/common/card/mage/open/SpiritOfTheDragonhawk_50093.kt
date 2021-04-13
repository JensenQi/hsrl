package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritOfTheDragonhawk_50093 : Card() {
    override val id = 50093
    override val name = "龙鹰之灵"
    override val description = "<b>潜行</b>一回合。你的英雄技能会以选中的随从及其相邻随从作为 目标。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "龙鹰并不擅长精确打击。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9aa0f58990ed95975aa538bf5837d9ff337d5c395f2dc79a952bba7e0a36e9a7.png"
}
