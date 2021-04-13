package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FaerieDragon_70087 : Card() {
    override val id = 70087
    override val name = "精灵龙"
    override val description = "无法成为法术或英雄技能的 目标。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "可爱至极，免疫魔法，不会在毯子上撒尿。真是完美的宠物！"
    override val artist = "Samwise"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/02e76066caf416ac4b469ef3fb016874e3535e65c92f2dab803d7148b8486d6c.png"
}
