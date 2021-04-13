package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Archmage_68393 : Card() {
    override val id = 68393
    override val name = "大法师"
    override val description = "<b>法术伤害+1</b>"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "只要你能消灭任何质疑你的头衔的人，你就能获得“大法师”的头衔。"
    override val artist = "Steve Ellis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad9ac54ee46c360dfd49220a730f73228a00dc688aaa16487a8095319594a5f5.png"
}
