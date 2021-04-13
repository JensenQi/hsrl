package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheClaw_692 : Card() {
    override val id = 692
    override val name = "利爪德鲁伊"
    override val description = "<b>抉择：</b>将该随从变形成为5/4并具有<b>突袭</b>；或者将该随从变形成为5/6并具有<b>嘲讽</b>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy3
    override val background = "是猎豹还是熊？！是猎豹还是熊？！真是艰难的抉择！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8627ab2e41d565ebdca57ceed46efec92a63f9a3971124e5fa86393638b8ca9.png"
}
