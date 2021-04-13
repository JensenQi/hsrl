package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystalsongPortal_51781 : Card() {
    override val id = 51781
    override val name = "晶歌传送门"
    override val description = "<b>发现</b>一张德鲁伊随从牌。如果你的手牌中没有随从牌，则保留全部三张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "变形晶刚，出发！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b786c288ac698400de8f2845a9483997f67ec0dd95fcc8c8875c565bd06a0003.png"
}
