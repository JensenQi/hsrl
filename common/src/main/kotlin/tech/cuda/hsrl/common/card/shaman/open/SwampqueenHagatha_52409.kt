package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwampqueenHagatha_52409 : Card() {
    override val id = 52409
    override val name = "沼泽女王哈加莎"
    override val description = "<b>战吼：</b> 将一个5/5的恐魔置入你的手牌，并教会它两个萨满祭司法术。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "拉法姆很欣赏哈加莎，因为砰砰博士讲笑话的时候她从来都不笑。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6dc79f203ee3ac4314aebd954f039c76b063d70546558e9aac7cd3087d0e6196.png"
}
