package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LavaBurst_69893 : Card() {
    override val id = 69893
    override val name = "熔岩爆裂"
    override val description = "造成 5点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "就像火焰领主吐了一口口水，呃，火。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a5ff985f21fa19ebf99f1f4fd426164e554b262b9fac972a8569fbccead533a.png"
}
