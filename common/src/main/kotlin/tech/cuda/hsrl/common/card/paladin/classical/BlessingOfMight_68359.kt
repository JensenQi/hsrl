package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfMight_68359 : Card() {
    override val id = 68359
    override val name = "力量祝福"
    override val description = "使一个随从获得+3攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "没有善，没有恶，也没有圣光。只有——力量！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac06fb1511661e0bff6997822d17094a7624a9d72fc4472478030dc22da83a6b.png"
}
