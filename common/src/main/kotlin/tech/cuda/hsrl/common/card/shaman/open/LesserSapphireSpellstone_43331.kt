package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserSapphireSpellstone_43331 : Card() {
    override val id = 43331
    override val name = "小型法术蓝宝石"
    override val description = "选择一个友方随从，召唤一个它的复制。 <i>（<b>过载</b>三个法力水晶后升级。）</i>"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“蓝色的石头归海底的鱼人领主所有，被粘液包裹起来。很快鱼人就拥上了海滩，两只，四只，然后是更多，更多……”——《魔石》"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6238b71adb11d7f542c250706574d26060d5a4dbe8d86d81f325e734ee958c68.png"
}
