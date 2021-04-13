package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StarvingBuzzard_1241 : Card() {
    override val id = 1241
    override val name = "饥饿的秃鹫"
    override val description = "每当你召唤一个野兽，抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy1635
    override val background = "如果你喂饱了它，它就名不副实了。"
    override val artist = "Bernie Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/68f16d2e07f692ea90311cef92f1f41e1a61c9ef371de1913bd331430fe65334.png"
}
