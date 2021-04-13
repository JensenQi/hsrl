package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NobleSacrifice_584 : Card() {
    override val id = 584
    override val name = "崇高牺牲"
    override val description = "<b>奥秘：</b>当一个敌人攻击时，召唤一个2/1的防御者，并使其成为攻击的目标。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "我们永远不会忘记你，“守护者！”"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/90a7bbce5fed2828da8d49cbff57dd9fa9d1ac40dd1d7b317050baddf84a9563.png"
}
