package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OgreWarmaul_2022 : Card() {
    override val id = 2022
    override val name = "食人魔战槌"
    override val description = "50%几率攻击错误的敌人。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "简单、鲁莽、危险，就像一切和食人魔有关的东西一样。"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f6e06a31a5d7720f0d10a9c82ac416f4bbab5d6e47db1f7345af2a2b6ee8f54.png"
}
