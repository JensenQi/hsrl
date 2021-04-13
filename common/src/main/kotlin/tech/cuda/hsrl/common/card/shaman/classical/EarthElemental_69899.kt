package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthElemental_69899 : Card() {
    override val id = 69899
    override val name = "土元素"
    override val description = "<b>嘲讽</b>，<b>过载：</b>（3）"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "硬如磐石，坚不可破。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e7e4ca7770dc6390d2da350a4d96c56b2d0580b34ab9d628b75bfb8da80dae7.png"
}
