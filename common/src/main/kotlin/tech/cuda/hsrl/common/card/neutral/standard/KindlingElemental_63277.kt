package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KindlingElemental_63277 : Card() {
    override val id = 63277
    override val name = "火光元素"
    override val description = "<b>战吼：</b>你的下一张元素牌的法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "有一分热，发一分光。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a0b5cb437c3ac78202a99d007f022753c32bad9c16b9396b207825a7e987fe4.png"
}
