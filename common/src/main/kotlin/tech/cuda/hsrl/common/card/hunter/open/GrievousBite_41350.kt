package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrievousBite_41350 : Card() {
    override val id = 41350
    override val name = "凶残撕咬"
    override val description = "对一个随从造成 2点伤害，并对其相邻的随从 造成 1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "牙好，胃口就好，什么都想咬一口。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38197f0c5ef86beb1728fb991dd9a35b11bd775e320fc2b98ca9d521f660184f.png"
}
