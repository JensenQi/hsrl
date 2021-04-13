package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bloodlust_1171 : Card() {
    override val id = 1171
    override val name = "嗜血"
    override val description = "在本回合中，使你的所有随从获得+3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "呜啊哇哇哇哇哇！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a061180be04ee343deff2f36c6ea896b34b82b42832cddf5c3553993bbc14a15.png"
}
