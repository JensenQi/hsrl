package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightOfTheNaaru_1933 : Card() {
    override val id = 1933
    override val name = "纳鲁之光"
    override val description = "恢复 3点生命值。如果目标仍处于受伤状态，则召唤一个圣光护卫者。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Gvg
    override val background = "“把那里夷为平地！”在接到这样的命令后，圣光护卫者们义无反顾地冲上前去，而地精们则回到了他们的军火库。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee9e7355863b555b55ca8b3fb13a9cc616fe7c80d0d25877ea0feca83ae3da07.png"
}
