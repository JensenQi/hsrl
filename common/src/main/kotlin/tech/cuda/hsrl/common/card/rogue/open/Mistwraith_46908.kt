package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mistwraith_46908 : Card() {
    override val id = 46908
    override val name = "迷雾幽灵"
    override val description = "每当你使用一张<b>回响</b>牌时，获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.TheWitchwood
    override val background = "找呀找呀找朋友，找到一个……<b>什么鬼</b>。"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aeda77ded9c87d93c3425b864b1aedca415606081fd11c61e631a03e6586d1ba.png"
}
