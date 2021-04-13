package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bloodlust_68336 : Card() {
    override val id = 68336
    override val name = "嗜血"
    override val description = "在本回合中，使你的所有随从获得+3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "呜啊哇哇哇哇哇！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4282dc4fa5084c589d795655dfbbaf9fbe81fbc1ed460e1e9e1c5f90cc416c35.png"
}
