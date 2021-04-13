package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bolster_2754 : Card() {
    override val id = 2754
    override val name = "加固"
    override val description = "使你具有<b>嘲讽</b>的随从获得+2/+2。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "最好的进攻就是防守。"
    override val artist = "Mishi McCaig"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/95eddb79db6ccf09865953bff258d2b85cfd149dd067eb80ec3ce2e37c93f62d.png"
}
