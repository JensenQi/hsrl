package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DefenderOfArgus_763 : Card() {
    override val id = 763
    override val name = "阿古斯防御者"
    override val description = "<b>战吼：</b>使相邻的随从获得+1/+1和<b>嘲讽</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "你肯定没想到阿古斯会需要如此坚实的防御。但它确实需要。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eefd4b04535e038617a9175041c7e50622016df5e96577aa38ca8bc5666fde57.png"
}
