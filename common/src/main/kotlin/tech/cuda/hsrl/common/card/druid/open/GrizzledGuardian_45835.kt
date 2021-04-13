package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrizzledGuardian_45835 : Card() {
    override val id = 45835
    override val name = "灰熊守护者"
    override val description = "<b>嘲讽，亡语：</b><b>招募</b>两个法力值消耗小于或等于（4）点的随从。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "最喜欢的三明治是芝士熊肉。"
    override val artist = "Alexey Aparin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ae58c8d819f328fc47715dde71aab43a0e0645988747ce479f72453686e50687.png"
}
