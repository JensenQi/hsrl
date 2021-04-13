package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AuspiciousSpirits_61283 : Card() {
    override val id = 61283
    override val name = "吉兆"
    override val description = "随机召唤一个法力值消耗为（4）的随从。<b>腐蚀：</b>改为召唤法力值消耗为（7）的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "好运来，祝你好运来！好运带来了喜和爱！"
    override val artist = "Forrest Imel"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f33b9c1f7209375d551a2334d8be9acadd0e115a9c6121aa239d2741cc3e039f.png"
}
