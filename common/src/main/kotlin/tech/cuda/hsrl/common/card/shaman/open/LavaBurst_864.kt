package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LavaBurst_864 : Card() {
    override val id = 864
    override val name = "熔岩爆裂"
    override val description = "造成 5点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "就像火焰领主吐了一口口水，呃，火。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/95f0ec6948b567eeaf51c6ec5e37dc606f80d370d7ca1bcfe72a9739a7de187f.png"
}
