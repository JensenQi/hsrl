package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Consecration_68366 : Card() {
    override val id = 68366
    override val name = "奉献"
    override val description = "对所有敌人造成 2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "神圣的能量从圣洁的大地涌出。但是，味道也有点熏人。"
    override val artist = "Vance Kovacs"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dc84f0c15e75112a2c51c867d158d792ac8bb02caffe8cc9875ec16227d0ab3d.png"
}
