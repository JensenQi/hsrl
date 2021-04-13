package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfKings_68364 : Card() {
    override val id = 68364
    override val name = "王者祝福"
    override val description = "使一个随从获得+4/+4。<i>（+4攻击力/+4生命值）</i>"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "你知道世界上有多少所谓的“王者”被暗杀了吗？你确定还想要王者祝福吗？"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/05586f11782aeccd9e64353ba70256a3a4e51870e749c0fafc67ba7749046a45.png"
}
