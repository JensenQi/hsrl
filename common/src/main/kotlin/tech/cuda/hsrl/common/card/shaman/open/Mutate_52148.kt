package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mutate_52148 : Card() {
    override val id = 52148
    override val name = "突变"
    override val description = "将一个友方随从随机变形成为一个法力值消耗增加（1）点的随从。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.RiseOfShadows
    override val background = "想得到预期的突变结果？除非鱼人都会飞！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/554e033616790d4a312a035f9bbb63000ff354b5038599ab4cdca0cba3334ba1.png"
}
