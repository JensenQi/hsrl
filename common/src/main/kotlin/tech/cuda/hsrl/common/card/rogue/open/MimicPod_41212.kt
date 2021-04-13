package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MimicPod_41212 : Card() {
    override val id = 41212
    override val name = "拟态豆荚"
    override val description = "抽一张牌，然后将一张它的复制置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "妈妈常说，吃啥补啥！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a14cd440b10bb6d33a4c6811eae5f18378629f293cc13fa4d158695e469770d.png"
}
