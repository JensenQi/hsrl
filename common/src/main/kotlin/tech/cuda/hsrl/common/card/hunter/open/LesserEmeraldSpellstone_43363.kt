package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LesserEmeraldSpellstone_43363 : Card() {
    override val id = 43363
    override val name = "小型法术翡翠"
    override val description = "召唤两只3/3的狼。<i>（使用一个<b>奥秘</b>后升级。）</i>"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“牛头人得到了这块绿色的石头，想要用它的力量拯救自己的土地。他们释放了心中的怒火，族群却从此失落。究竟谁是猎手，谁又是野兽？”——《魔石》"
    override val artist = "Joe Wilson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f1804076efb560c59da7b19772e3adfa3812dcee2f0b6bad7450f442ab18be2.png"
}
