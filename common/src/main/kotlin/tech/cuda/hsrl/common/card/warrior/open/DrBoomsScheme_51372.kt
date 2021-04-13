package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrBoomsScheme_51372 : Card() {
    override val id = 51372
    override val name = "砰砰博士的阴谋"
    override val description = "获得1点护甲值。<i>（每回合都会升级！）</i>"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“哇哈哈！我们把金库炸飞了！”“你是说金库大门吗？”“呃，是炸门啊……”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68c0a29c718e77bea362c0eaa4f40c6a3e834651bc04ed49ef6bcb6396a90447.png"
}
