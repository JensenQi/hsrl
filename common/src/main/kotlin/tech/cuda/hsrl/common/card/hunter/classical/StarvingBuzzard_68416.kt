package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StarvingBuzzard_68416 : Card() {
    override val id = 68416
    override val name = "饥饿的秃鹫"
    override val description = "每当你召唤一个野兽，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "如果你喂饱了它，它就名不副实了。"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/750c254a10743e9c4f3e5f78691bb708c4a6db16c069d01709954a1bcd7a66cc.png"
}
