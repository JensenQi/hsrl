package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DefenderOfArgus_69843 : Card() {
    override val id = 69843
    override val name = "阿古斯防御者"
    override val description = "<b>战吼：</b>使相邻的随从获得+1/+1和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "你肯定没想到阿古斯会需要如此坚实的防御。但它确实需要。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7cb1d182122eb18d58bfdc0b78af60f4f567168757042c69b6eba5c1bc620bdb.png"
}
