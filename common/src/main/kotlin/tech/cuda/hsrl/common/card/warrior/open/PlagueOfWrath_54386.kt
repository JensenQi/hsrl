package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PlagueOfWrath_54386 : Card() {
    override val id = 54386
    override val name = "愤怒之灾祸"
    override val description = "消灭所有受伤的随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "别人生气我不气，气出病来无人替。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf4771e7449348eba6beecc3f50aefcf57a85e716df0ce5f559d7852fe23e70a.png"
}
