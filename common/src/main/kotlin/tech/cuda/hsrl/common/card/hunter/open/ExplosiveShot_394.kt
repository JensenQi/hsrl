package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveShot_394 : Card() {
    override val id = 394
    override val name = "爆炸射击"
    override val description = "对一个随从造成 5点伤害，并对其相邻的随从造成 2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "拉动保险销，数到5，再开火。然后躲起来。"
    override val artist = "Tom Baxa"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aec1fd422407fc47b644b6ce14a96e4ed61749ddf484dc22f331145f230e1acb.png"
}
