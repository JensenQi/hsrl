package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FaerieDragon_609 : Card() {
    override val id = 609
    override val name = "精灵龙"
    override val description = "无法成为法术或英雄技能的目标。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "可爱至极，免疫魔法，不会在毯子上撒尿。真是完美的宠物！"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3048fd3f6800424794e41defc9f497c7a0f3034c5793af3954c524d9137ba588.png"
}
