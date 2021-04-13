package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BindingHeal_41170 : Card() {
    override val id = 41170
    override val name = "联结治疗"
    override val description = "为你的英雄和一个随从恢复 5点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "接受本次治疗就意味着您默认接受了以下条款…"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4fcf9ac15c5c21cc28476053de3d29579a134d05008d0f9bb58e45bd2734d952.png"
}
