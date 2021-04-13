package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Greybough_61606 : Card() {
    override val id = 61606
    override val name = "格雷布"
    override val description = "<b>嘲讽</b>，<b>亡语：</b>随机使一个友方随从获得“<b>亡语：</b>召唤格雷布。”"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "种一棵树的最佳时间是二十年前，其次是你的随从倒下的时候。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8ffba080226f41dfda1c03ff0c5788ec06baeed5f35be342485c6dbf0a1a7b91.png"
}
