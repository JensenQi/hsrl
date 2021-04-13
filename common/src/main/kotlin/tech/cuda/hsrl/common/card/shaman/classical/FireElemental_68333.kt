package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireElemental_68333 : Card() {
    override val id = 68333
    override val name = "火元素"
    override val description = "<b>战吼：</b>造成3点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "他从来不洗澡。嗯..."
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca23efbbc3c76e91b9c55f45e3954709c8fdd378218104340e165830f1aade0a.png"
}
