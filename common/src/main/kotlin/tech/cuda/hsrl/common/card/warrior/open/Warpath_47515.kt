package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Warpath_47515 : Card() {
    override val id = 47515
    override val name = "战路"
    override val description = "<b>回响</b> 对所有随从造成 1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "躲过这招的秘诀就是反复左右横跳。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5a039298fa462deb3dbbd4aaa2b082022a29d1915e598a36117213bbd7275185.png"
}
