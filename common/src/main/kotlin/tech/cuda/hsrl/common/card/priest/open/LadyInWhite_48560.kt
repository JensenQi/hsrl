package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LadyInWhite_48560 : Card() {
    override val id = 48560
    override val name = "白衣幽魂"
    override val description = "<b>战吼：</b>对你牌库中的所有随从施放“心灵之火”<i>（使其攻击力等同于生命值）</i>。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "以前是圆点幽魂。可经过侏儒洗衣店的一次人为事故后，变成了现在这样子。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a7f299cb6885dd2977cd157491b2b955fe8e31d6e15671a926fa5f12726fcea.png"
}
