package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DaUndatakah_50443 : Card() {
    override val id = 50443
    override val name = "送葬者安德提卡"
    override val description = "<b>战吼：</b>获得在本局对战中三个死亡的友方随从的<b>亡语</b>。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "亡语一：抽一张牌。亡语二：抽两张牌。亡语三：将对手扔下五米高的铁笼，直接击穿播报员的桌子。"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81e948b7fcf46aded3e4c345fc6bcef6320df83fd0fa4e163ec4474a65921b01.png"
}
