package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClutchmotherZavas_41876 : Card() {
    override val id = 41876
    override val name = "萨瓦丝女王"
    override val description = "每当你弃掉这张牌时，使其获得+2/+2，并将其移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "主人弃我千百遍，我待主人如初恋。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ccf1c527d65df2837bad11e5592cd790f8bfc1c0018fabbe35fcdfa794d7ccc9.png"
}
