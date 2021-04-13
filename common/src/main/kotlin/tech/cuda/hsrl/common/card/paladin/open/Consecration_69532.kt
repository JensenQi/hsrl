package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Consecration_69532 : Card() {
    override val id = 69532
    override val name = "奉献"
    override val description = "对所有敌人造成 2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "神圣的能量从圣洁的大地涌出。但是，味道也有点熏人。"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5edcd503ee8c5f4bce69e5dffb42bc1ef15b4e2be32fd88e7e22b9a70801cb1c.png"
}
