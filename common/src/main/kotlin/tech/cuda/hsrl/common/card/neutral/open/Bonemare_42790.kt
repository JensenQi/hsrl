package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bonemare_42790 : Card() {
    override val id = 42790
    override val name = "骨魇"
    override val description = "<b>战吼：</b>使一个友方随从获得+4/+4和<b>嘲讽</b>。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "请尽全力攻击她的杰作。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3c9b70a5f22fbb6fe9c6c430f5ff394d85af3f5d35d3d44d335f410c8ed5c572.png"
}
