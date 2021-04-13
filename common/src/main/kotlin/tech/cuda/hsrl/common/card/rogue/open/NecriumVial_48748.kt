package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NecriumVial_48748 : Card() {
    override val id = 48748
    override val name = "死金药剂"
    override val description = "触发一个友方随从的<b>亡语</b>两次。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "一次消费，双重体验！"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9c5063b85318baff0585aa483950f73db2293bd3ceecf50405c466af5dc0f3d1.png"
}
