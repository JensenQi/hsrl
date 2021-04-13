package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demonbolt_50991 : Card() {
    override val id = 50991
    override val name = "恶魔之箭"
    override val description = "消灭一个随从。你每有一个随从，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“我不管，反正我人多！”"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68a60b24f683081d637b1cb355b4a07f0b5c86e7a4026e51e3d9708b77cecd7a.png"
}
