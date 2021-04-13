package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Consecration_476 : Card() {
    override val id = 476
    override val name = "奉献"
    override val description = "对所有敌人造成 2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy1635
    override val background = "神圣的能量从圣洁的大地涌出。但是，味道也有点熏人。"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d8351c7cd95fab1bb2fa8aa86006366b3f5b0a3a26abe361d101bd86bd6127e.png"
}
