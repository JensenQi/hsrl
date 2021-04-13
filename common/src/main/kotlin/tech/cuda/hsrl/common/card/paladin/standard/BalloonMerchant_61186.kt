package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BalloonMerchant_61186 : Card() {
    override val id = 61186
    override val name = "气球商人"
    override val description = "<b>战吼：</b>使你的白银之手新兵获得+1攻击力和<b>圣盾</b>。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "多好看的金色气球！但只要受到一点伤害，它就会爆掉。"
    override val artist = "Forrest Imel"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4944be44150ffa02a476defe73ac9e9d093aa7c2073b362db88bdd1c43c7aa09.png"
}
