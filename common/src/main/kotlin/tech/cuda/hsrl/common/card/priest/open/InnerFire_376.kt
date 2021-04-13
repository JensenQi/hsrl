package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InnerFire_376 : Card() {
    override val id = 376
    override val name = "心灵之火"
    override val description = "使一个随从的攻击力等同于其生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "“但是，真正的胜利，孩子——是鼓舞你的子民心中的斗志。”——泰瑞纳斯·米奈希尔"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4ae6c3defd3da172e4c3d1d5c44503c45a59eca5acef6bf062b6a816ef8c1272.png"
}
