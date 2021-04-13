package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shotbot_56077 : Card() {
    override val id = 56077
    override val name = "炮火机甲"
    override val description = "<b>复生</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "侦测到即将落地。启动英雄造型。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9fbf187dafd08761cf07f408fa663a97a2f9d61bd8a6abf1187d0509c83d897b.png"
}
