package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Fatespinner_42615 : Card() {
    override val id = 42615
    override val name = "命运织网蛛"
    override val description = "<b>秘密亡语：</b> <b>抉择：</b>对所有随从造成3点伤害；或者使所有随从获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "你问她那件衣服的材质？当然是纯丝制品。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd01b56035126bad8312e1d590b20004533b826ccd5597ef5ba2a290509a70b5.png"
}
