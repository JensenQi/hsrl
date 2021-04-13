package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnleashTheBeast_52089 : Card() {
    override val id = 52089
    override val name = "猛兽出笼"
    override val description = "<b>双生法术</b> 召唤一只5/5并具有<b>突袭</b>的双足飞龙。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RiseOfShadows
    override val background = "肯瑞托在强制宠物栓绳方面的法规一直很宽松。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/059e3fc2b2939014bae9535457207afe7eee1f23dd01e638b6e726012c91071c.png"
}
