package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BogstrokClacker_56417 : Card() {
    override val id = 56417
    override val name = "泥沼巨钳龙虾人"
    override val description = "<b>战吼：</b> 将相邻的随从随机变形成为法力值消耗增加（1）点的随从。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "龙虾龙虾两只爪，左右一夹就变大。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0aef9503fcbeb6a3ab5df3c8ce58519950226f7adb5d91519001e6ded03ee83d.png"
}
