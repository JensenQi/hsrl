package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RottenApplebaum_47557 : Card() {
    override val id = 47557
    override val name = "腐烂的苹果树"
    override val description = "<b>嘲讽，亡语：</b>为你的英雄恢复 4点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "现在你知道吉尔尼斯的苹果酱为什么会……这么酸爽了吧。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c6134db1153cbafef027199f37862b6b6ed057c20a3067cfafc489c33fa4ef78.png"
}
